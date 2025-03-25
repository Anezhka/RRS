package Homework.Lesson11.Part11_1;

public class Block {
  public int width;
  public int length;
  public int height;

  public Block(int[] arr) {
    this.width = arr[0];
    this.length = arr[1];
    this.height = arr[2];
  }

  public int getSurfaceArea() {
    return (width * length + width * height + length * height) * 2;
  }

  public int getVolume() {
    return width *length * height;
  }

  public int getWidth() {
    return width;
  }

  public int getLength() {
    return length;
  }

  public int getHeight() {
    return height;
  }
}
