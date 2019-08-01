# P-CIPHER
This is basically s-cipher except it's better and it also uses text instead of ASCII codes. You can basically put anything into it if you use the library, but it doesn't work well with large amounts of text so it's better to split it up into words, p-cipher them, then use the whole words as the objects and p-cipher them.

# Usage
The usage for p-cipher is simple. Simply run java -jar p-cipher.jar <encrypt|decrypt> <message>.

# Library Usage
P-Cipher is mainly meant to be used as a library, and the p-cipher.jar allows you to use it as such. Once you include it into your build path, all you have to do is create an ArrayList<String> (ArrayList<String> arr = new ArrayList<String>(); of whatever you want to shuffle. This ArrayList can be made up of every single character of a message, or every word of a sentence, it's your choice. Next, import Polygon (import com.PintsizedSix40.pcipher.Polygon;). Now, create a new Polygon object using your ArrayList in its constructor. (Polygon p = new Polygon(arr);). To encrypt, use Polygon#encrypt(int key), and for decryption use Polygon#decrypt(int key) (p.encrypt(100); p.decrypt(100);). Now that it's encrypted, use Polygon#get() to get the output as an ArrayList<String>. You can use this ArrayList however you want, but ensure that when decrypting, it and the input ArrayList are exactly the same!
