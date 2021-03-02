import React from 'react';

const BodyHome = () => {
    window.addEventListener('scroll', () => {
        const header = document.getElementById('containerHeader');
        header.style.opacity = '1' - window.pageYOffset / 550;
    });
    

    return (
        <main id="main">
            <section class="container">
                <h2 class="subtitle-h2">Servicios</h2>
                <p><span class="letter-capital">P</span>ara despejar la cabeza orem ipsum dolor sit amet consectetur adipisicing elit. Voluptatem rerum provident distinctio dolores nisi corporis! Adipisci inventore nostrum exercitationem id repellendus maxime voluptate recusandae autem, earum accusamus, non, cupiditate nihil!</p>

                <p>Doloremque voluptatum incidunt architecto explicabo voluptate eveniet, accusantium odit alias est fugiat eum consectetur dolor consequatur nihil at voluptatibus inventore, temporibus tempora?
                Est itaque, corrupti, reprehenderit placeat aut deleniti a vel ipsum perspiciatis accusamus quasi, quo earum consequatur. Cum distinctio quae sapiente fuga laboriosam.</p>

                <p>Cupiditate nam dolore inventore at dicta molestiae, adipisci voluptatem nihil asperiores, sunt debitis? Rerum, sed impedit qui sapiente eaque nesciunt voluptas consequuntur!</p>
            </section>
        </main>
    );
}

export default BodyHome;