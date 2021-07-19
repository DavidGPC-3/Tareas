<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/css/style.css">
        <title>Classroom</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>

    <body>
        <nav>
            <div class="navbar d-flex ai-center">
                <img src="resources/assets/icons/logo-yimi.svg" alt="">
                <div class="header">
                    Tus tareas
                </div>
                <div class="nav-buttons d-flex ai-center">
                    <button class="newTask" onclick="openTaskModal()">
                        <p>Nueva tarea</p>
                    </button>
                    <div class="to-do">
                        <p>Tareas pendientes: <span id="pendingTasks">0</span></p>
                    </div>
                </div>
            </div>
        </nav>
        <div class="container tareas d-flex fd-column">
            <div>
                <h2>Tareas pendientes</h2>
            </div>
            <table>
                <thead>
                    <tr>
                        <th></th>
                        <th>Tarea</th>
                        <th class="th_hora">Fecha y hora</th>
                        <th></th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>
                            <input type="checkbox" id="check">
                        </td>
                        <td>Español 1</td>
                        <td>16/07/2021 12:48</td>
                        <td>
                            <a href="" class="deleteTask">Eliminar</a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="checkbox" id="check">
                        </td>
                        <td>Matemáticas 5</td>
                        <td>16/07/2021 12:48</td>
                        <td>
                            <a href="" class="deleteTask">Eliminar</a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="checkbox" id="check">
                        </td>
                        <td>Ciencias 3</td>
                        <td>16/07/2021 12:48</td>
                        <td>
                            <a href="" class="deleteTask">Eliminar</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="container tareas d-flex fd-column">
            <div>
                <h2>Tareas completadas</h2>
            </div>
            <table>
                <thead>
                    <tr>
                        <th></th>
                        <th>Tarea</th>
                        <th class="th_hora">Fecha y hora</th>
                        <th></th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>
                            <!-- <input type="checkbox" id="check"> -->
                        </td>
                        <td>Español 1</td>
                        <td>16/07/2021 12:48</td>
                        <td>
                            <a href="" class="deleteTask">Eliminar</a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <!-- <input type="checkbox" id="check"> -->
                        </td>
                        <td>Matemáticas 5</td>
                        <td>16/07/2021 12:48</td>
                        <td>
                            <a href="" class="deleteTask">Eliminar</a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <!-- <input type="checkbox" id="check"> -->
                        </td>
                        <td>Ciencias 3</td>
                        <td>16/07/2021 12:48</td>
                        <td>
                            <a href="" class="deleteTask">Eliminar</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>

        <section class="nuevaTarea" id="taskModal">
            <form action="crear.htm" method="POST">
                <input type="text" placeholder="Nombre de la tarea">
                <button class="newTask" type="submit" onclick="closeTaskModal()"><p>Crear</p></button>
            </form>
        </section>

        <script src="resources/javascript/script.js"></script>
    </body>

    </html>