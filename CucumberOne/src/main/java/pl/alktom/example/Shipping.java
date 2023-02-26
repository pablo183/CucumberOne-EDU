package pl.alktom.example;

public class Shipping {
        public static String shipBook(String bookFormat) {
            switch(bookFormat) {
                case "PDF":
                    return "sent to a mobile device";
                case "Audiobook":
                    return "sent over email";
                case "Hardcover":
                case "Paperback":
                case "Audio CD":
                    return "shipped physically";
                default:
                    return "invalid book format";
            }
        }
    }


