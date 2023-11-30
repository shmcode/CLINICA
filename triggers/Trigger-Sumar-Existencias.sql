-- Trigger para actualizar la cantidad en stock después de realizar una compra
CREATE TRIGGER tr_realizar_compra ON Inventario_compra
AFTER INSERT
AS
BEGIN
    -- Sumar la CantidadComprada a Medicamentos.Existencias
    UPDATE m
    SET cantidadExistencia = m.cantidadExistencia + i.cantidad
    FROM dbo.Medicamento m
    INNER JOIN inserted i ON m.id = i.idmed;
END;

