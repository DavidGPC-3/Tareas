function closeOut(ev) {
    if (ev.target.className === 'nuevaTarea') {
        $('#taskModal').fadeOut();
    }
}

function openTaskModal() {
    $('#taskModal').css("display", "flex").hide().fadeIn(300);
    document.addEventListener('click', closeOut);
}

function closeTaskModal() {
    $('#taskModal').fadeOut(300);
}