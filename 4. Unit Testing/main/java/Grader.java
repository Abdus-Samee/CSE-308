public class Grader {
    public String calculateGrade(String str_score, String str_credit){
        int credit = 0;
        double score = 0.0;

        try {
            score = Double.parseDouble(str_score);
            credit = Integer.parseInt(str_credit);

            if(credit!=3 && credit!=4) throw new Exception();

            int marks = (int) Math.ceil(score);
            String grade = "F";

            if (marks < 0) throw new IllegalArgumentException("Marks provided is below lower bound 0.");
            else if (marks > 400) throw new IllegalArgumentException("Marks provided is above upper bound 400.");
            else if ((credit == 3 && (marks >= 240 && marks <= 400)) || (credit == 4 && (marks >= 320 && marks <= 400)))
                grade = "A";
            else if ((credit == 3 && (marks >= 210 && marks <= 239)) || (credit == 4 && (marks >= 280 && marks <= 319)))
                grade = "B";
            else if ((credit == 3 && (marks >= 180 && marks <= 209)) || (credit == 4 && (marks >= 240 && marks <= 279)))
                grade = "C";

            return grade;
        }catch(Exception e){
            throw new NumberFormatException("Input(s) is not a number");
        }
    }
}
