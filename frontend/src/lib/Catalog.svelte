
<script>
        import Song from "./Song.svelte";
        export let songs;

</script>


<section>
    <div class="div_song">
        {#each songs as info}
            <Song song={info}/>
        {/each}
    </div>
</section>


<style>
    section{
        display: grid;
        justify-items: flex-end;
        margin-right: 200px;
        margin-top: 25px;
    }
  .div_song{
      display: grid;
      grid-template-columns: repeat(2, 2fr);
      gap: 3%;
  }
</style>
