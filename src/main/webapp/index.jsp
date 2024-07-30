<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <style>
    body {
        margin: 0;
        font-family: Tahoma, sans-serif;
    }

    .intro {
        max-height: 100vh;
        overflow: hidden;
        position: relative;

        background: url("cover.jpg") center no-repeat;
        background-size: cover;
    }

    .intro:after {
        content: "";
        display: block;
        width: 100%;
        height: 100%;

        background-color: rgba(0, 0, 0, .8);

        position: absolute;
        top: 0;
        left: 0;
        z-index: 2;
    }

    .intro__content {
        display: flex;
        flex-direction: column;
        justify-content: center;
        width: 100%;
        height: 100%;

        position: absolute;
        top: 0;
        left: 0;
        z-index: 3;
    }

    .intro__title {
        margin: 0;

        font-size: 45px;
        color: #fff;
        text-align: center;
    }

    .container {
        width: 100%;
        max-width: 1200px;
        margin: 0 auto;
    }

    .video {
        position: relative;
        z-index: 1;
        padding-bottom: 56.25%;
    }

    .video__media {
        width: 100%;
        height: auto;

        position: absolute;
        top: 0;
        left: 0;
    }
    </style>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Video Background</title>
</head>
<body>
    <div class="intro">
        <div class="video">
            <video class="video__media" src="src/main/webapp/WEB-INF/views/video.mp4" autoplay muted loop></video>
        </div>

        <div class="intro__content">
            <div class="container">
                <h1 class="intro__title">Hello, video background!</h1>
            </div>
        </div>
    </div>
</body>
</html>
