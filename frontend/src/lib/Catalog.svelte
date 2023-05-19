
<script>
        import Song from "./Song.svelte";
        export let songs;

</script>


<section class="songs-list">
    <div class="div_song">
        {#each songs as info}
            <Song song={info}/>
        {/each}
    </div>
</section>


<style>
  .div_song{
      display: grid;
      grid-template-columns: repeat(2, 2fr);
      gap: 3%;
  }
</style>
