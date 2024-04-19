public interface Publicacao {
  abstract public void abrir();

  abstract public void fechar();

  abstract public void folhear();

  abstract public void avancarPag(int p);

  abstract public void voltarPag(int p);
}
