<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,300,0,0" />

<script>
    let like = false;
</script>


<div on:click={() => like = !like}>
    {#if like}
        <span class="material-symbols-outlined">
        heart_check
        </span>
    {:else}
        <span class="material-symbols-outlined">
        favorite
        </span>
    {/if}
</div>

<style>
     span{
         color: deeppink;
     }
</style>