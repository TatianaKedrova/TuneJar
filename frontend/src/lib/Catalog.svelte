<div class="row">
    <div class="col">
        <h1>My playlist</h1>
    </div>

    <div class="col">
        <div class="card card 1">
            <h5>Title</h5>
            <h5>Artist</h5>
        </div>
        <div class="card card 2">
            <h5>Title</h5>
            <h5>Artist</h5>
        </div>
        <div class="card card 3">
            <h5>Title</h5>
            <h5>Artist</h5>
        </div>
        <div class="card card 4">
            <h5>Title</h5>
            <h5>Artist</h5>
        </div>
    </div>
</div>


<style>
    .row {
        display: flex;
        height: 88%;
        align-items: center;
        color: white;
    }

    .col{
        flex-basis: 50%;
    }

    .card1{
        background-image: url(/images/);
    }

    .card2{
        background-image: url(/images/);
    }

    .card3{
        background-image: url(/images/);
    }

    .card4{
        background-image: url(/images/);
    }

    .card:hover{
        transform: translateY(-10px);
    }


</style>

