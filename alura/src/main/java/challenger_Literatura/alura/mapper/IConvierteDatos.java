package challenger_Literatura.alura.mapper;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);

}