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
