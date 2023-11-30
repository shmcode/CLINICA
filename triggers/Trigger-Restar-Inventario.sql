-- Trigger para actualizar la cantidad en stock después de dispensar una receta
CREATE TRIGGER tr_dispensar_receta ON Receta
AFTER INSERT
AS
BEGIN
    -- Restar la CantidadDispensada de Medicamentos.Existencias
    UPDATE m
    SET cantidadExistencia = m.cantidadExistencia - i.cantidad
    FROM Medicamento m
    INNER JOIN inserted i ON m.id = i.idmed;
END;





