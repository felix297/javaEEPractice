package com.company;

import umontreal.ssj.probdist.NormalDist;

public class SSJ {
    public static void main (String args[]) {
        NormalDist normalDist = new NormalDist(0, 1);
        System.out.println(normalDist.cdf(0.674490*normalDist.getSigma()));
    }
}
