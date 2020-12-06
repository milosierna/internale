package sample;

import java.util.ArrayList;

public class Internals {
public static double getAverageOfPoints(ArrayList<Internal>internals) {
    double sum = 0;
    for (int i = 0; i < internals.size(); i++) {
        sum += internals.get(i).getPoints();
    }
    if (internals.size() != 0) {
        return sum / internals.size();
    } else {
        return 0;
    }
}
    public static double getAverageOfGrades(ArrayList<Internal>internals) {
        double sum = 0;
        for (int i = 0; i < internals.size(); i++) {
            sum += internals.get(i).getGrade();
        }
        if (internals.size() != 0) {
            return sum / internals.size();
        } else {
            return 0;
        }
    }

        public static Internal getMaxPointsOfInternal(ArrayList<Internal>internals) {
            Internal max = internals.get(0);
            for (int i = 1; i < internals.size(); i++) {
                if (internals.get(i).getPoints()> max.getPoints()) {
                    max = internals.get(i);
                }

            }
            return max;
        }
    public static float getPercentageOfTheBestGrade(ArrayList<Internal>internals) {
    float Percentage;
        for (int i = 1; i < internals.size(); i++) {
            if (internals.get(i).getGrade() == 7) {
                return Percentage = (float) ((internals.get(i).getGrade()*100/internals.size() ));


            }
        }


        return 0;
    }
    }





