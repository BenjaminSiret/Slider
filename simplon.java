void functionA(String str) {
  String result = new String();

  for (int i = 0; i < str.Length; i++) {
    if (!result.contains(str[i])) {
      result += str[i];
    }
  }

  Console.WriteLine(result);
}

functionA("benjamin");
