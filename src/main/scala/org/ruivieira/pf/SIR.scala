package org.ruivieira.pf

import breeze.linalg.DenseVector
import breeze.stats.distributions.Multinomial


object SIR {

  def resample(weights: Vector[Double]) : Vector[Int] = {
    Vector.fill(weights.length)(Multinomial(DenseVector(weights.toArray)).draw())
  }

}

class SIR[S, T](val transition: S => S, val likelihood: (S, T) => Double) {

  def filter(states: Vector[S], obs: T) : Vector[S] = {
    val newStates = states.map(state => transition(state))
    val ls = newStates.map(newState => likelihood(newState, obs))
    SIR.resample(ls).map(index => newStates(index))
  }

}
