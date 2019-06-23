package streams;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class AnimalDecoder {
    public static Animal[] deserealize(byte[] data) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int countOfObjects = objectInputStream.readInt();
            Animal[] arrayOfAnimals = new Animal[countOfObjects];
            for (int i = 0; i < arrayOfAnimals.length; i++) {
                arrayOfAnimals[i] = (Animal) objectInputStream.readObject();
            }
            return arrayOfAnimals;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
