//try catch format
int readNumber(BufferedReader reader) throws IOException {
    String line = null;
    try {
        line = reader.readLine();
        return Integer.parseInt(line);
    } catch (IOException e) {
        return 0;
    }finally {
        reader.close();
    }
}

//Unhandled Chcecked Exception
public Integer firstLetterOfYourName(String letter) throws IOException {
       if (!letter.matches("[a-zA-Z]+"))
            throw new IOException("ONE LETTER, please!");
   }

// You should add throws IOException or try catch 
   public void tryFirstLetterOfYourName() {
       firstLetterOfYourName("a"); // Unhandled Exception
   }
