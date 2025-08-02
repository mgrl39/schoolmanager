2. Sistema de Gestión Escolar

FUNCIONALIDADES:
CRUD de estudiantes, profesores, cursos

QUEDA HACER:
    - MATERIA (Pertenece a un Curso, tiene mucho estudintes, caad estudiante tiene una nota en cada materia)

NOTA: 
    - Relaciona estudiante + Materia

CURSO;
    Tiene muchas aterias
    tiene muchos estudiantes

PROFESOR:
    puede imparter una o muchas materias

Matrícula de estudiantes en cursos
Registro de notas y asistencia
Generación de boletines
Roles: admin, profesor, alumno
APIs REST para frontend


- Course → ClassGroup
- ClassGroup → Student
- ClassGroup → Delegado (Student)
- Course → Subject
- Subject → Teacher
- Student → Grade
- Subject → Grade
