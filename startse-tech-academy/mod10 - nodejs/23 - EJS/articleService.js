const ARTICLES = [
    {
        "doi": "10.1038/nature14236",
        "title": "Human-level control through deep reinforcement learning",
        "abstract": "The theory of reinforcement learning provides a normative account1, deeply rooted in psychological2 and neuroscientific3 perspectives on animal behaviour, of how agents may optimize their control of an environment. To use reinforcement learning successfully in situations approaching real-world complexity, however, agents are confronted with a difficult task: they must derive efficient representations of the environment from high-dimensional sensory inputs, and use these to generalize past experience to new situations. Remarkably, humans and other animals seem to solve this problem through a harmonious combination of reinforcement learning and hierarchical sensory processing systems4,5, the former evidenced by a wealth of neural data revealing notable parallels between the phasic signals emitted by dopaminergic neurons and temporal difference reinforcement learning algorithms3. While reinforcement learning agents have achieved some successes in a variety of domains6,7,8, their applicability has previously been limited to domains in which useful features can be handcrafted, or to domains with fully observed, low-dimensional state spaces. Here we use recent advances in training deep neural networks9,10,11 to develop a novel artificial agent, termed a deep Q-network, that can learn successful policies directly from high-dimensional sensory inputs using end-to-end reinforcement learning. We tested this agent on the challenging domain of classic Atari 2600 games12. We demonstrate that the deep Q-network agent, receiving only the pixels and the game score as inputs, was able to surpass the performance of all previous algorithms and achieve a level comparable to that of a professional human games tester across a set of 49 games, using the same algorithm, network architecture and hyperparameters. This work bridges the divide between high-dimensional sensory inputs and actions, resulting in the first artificial agent that is capable of learning to excel at a diverse array of challenging tasks.",
    },
    {
        "doi": "10.1038/s41586-019-1654-9",
        "title": "Organoid single-cell genomic atlas uncovers human-specific features of brain development",
        "abstract": "The human brain has undergone substantial change since humans diverged from chimpanzees and the other great apes1,2. However, the genetic and developmental programs that underlie this divergence are not fully understood. Here we have analysed stem cell-derived cerebral organoids using single-cell transcriptomics and accessible chromatin profiling to investigate gene-regulatory changes that are specific to humans. We first analysed cell composition and reconstructed differentiation trajectories over the entire course of human cerebral organoid development from pluripotency, through neuroectoderm and neuroepithelial stages, followed by divergence into neuronal fates within the dorsal and ventral forebrain, midbrain and hindbrain regions. Brain-region composition varied in organoids from different iPSC lines, but regional gene-expression patterns remained largely reproducible across individuals. We analysed chimpanzee and macaque cerebral organoids and found that human neuronal development occurs at a slower pace relative to the other two primates. Using pseudotemporal alignment of differentiation paths, we found that human-specific gene expression resolved to distinct cell states along progenitor-to-neuron lineages in the cortex. Chromatin accessibility was dynamic during cortex development, and we identified divergence in accessibility between human and chimpanzee that correlated with human-specific gene expression and genetic change. Finally, we mapped human-specific expression in adult prefrontal cortex using single-nucleus RNA sequencing analysis and identified developmental differences that persist into adulthood, as well as cell-state-specific changes that occur exclusively in the adult brain. Our data provide a temporal cell atlas of great ape forebrain development, and illuminate dynamic gene-regulatory features that are unique to humans.",
    },
    {
        "doi": "10.1038/35050012",
        "title": "Structural basis of IAP recognition by Smac/DIABLO",
        "abstract": "Apoptosis is an essential process in the development and homeostasis of all metazoans1,2,3,4. The inhibitor-of-apoptosis (IAP) proteins suppress cell death by inhibiting the activity of caspases; this inhibition is performed by the zinc-binding BIR domains5,6 of the IAP proteins. The mitochondrial protein Smac/DIABLO promotes apoptosis by eliminating the inhibitory effect of IAPs through physical interactions7,8,9. Amino-terminal sequences in Smac/DIABLO are required for this function, as mutation of the very first amino acid leads to loss of interaction with IAPs and concomitant loss of Smac/DIABLO function9. Here we report the high-resolution crystal structure of Smac/DIABLO complexed with the third BIR domain (BIR3) of XIAP. Our results show that the N-terminal four residues (Ala-Val-Pro-Ile) in Smac/DIABLO recognize a surface groove on BIR3, with the first residue Ala binding a hydrophobic pocket and making five hydrogen bonds to neighbouring residues on BIR3. These observations provide a structural explanation for the roles of the Smac N terminus as well as the conserved N-terminal sequences in the Drosophila proteins Hid/Grim/Reaper. In conjunction with other observations, our results reveal how Smac may relieve IAP inhibition of caspase-9 activity. In addition to explaining a number of biological observations, our structural analysis identifies potential targets for drug screening.",
    },
    {
        "doi": "10.1038/ncomms5363",
        "title": "Unravelling the effects of radiation forces in water",
        "abstract": "The effect of radiation forces at the interface between dielectric materials has been a long-standing debate for over a century. Yet there has been so far only limited experimental verification in complete accordance with the theory. Here we measure the surface deformation at the air–water interface induced by continuous and pulsed laser excitation and match this to rigorous theory of radiation forces. We demonstrate that the experimental results are quantitatively described by the numerical calculations of radiation forces. The Helmholtz force is used for the surface radiation pressure. The resulting surface pressure obtained is consistent with the momentum conservation using the Minkowski momentum density expression assuming that the averaged momentum per photon is given by the Minkowski momentum. Considering the total momentum as a sum of that propagating with the electromagnetic wave and that deposited locally in the material, the Abraham momentum interpretation also appears to be appropriate.",
    },
    {
        "doi": "10.1016/S0378-4371(98)00437-3",
        "title": "The role of constraints within generalized nonextensive statistics",
        "abstract": "The Gibbs–Jaynes path for introducing statistical mechanics is based on the adoption of a specific entropic form S and of physically appropriate constraints. For instance, for the usual canonical ensemble, one adopts (i) , (ii) ∑ipi=1, and (iii)  ({εi}≡ eigenvalues of the Hamiltonian; U1≡ internal energy). Equilibrium consists in optimizing S1 with regard to {pi} in the presence of constraints (ii) and (iii). Within the recently introduced nonextensive statistics, (i) is generalized into Sq=k[1−∑ipiq]/[q−1] (q→1 reproduces S1), (ii) is maintained, and (iii) is generalized in a manner which might involve piq. In the present effort, we analyze the consequences of some special choices for (iii), and their formal and practical implications for the various physical systems that have been studied in the literature. To illustrate some mathematically relevant points, we calculate the specific heat respectively associated with a nondegenerate two-level system as well as with the classical and quantum harmonic oscillators.",
    },
    {
        "doi": "10.3389/fphy.2017.00052",
        "title": "The Role of Fractional Time-Derivative Operators on Anomalous Diffusion",
        "abstract": "The generalized diffusion equations with fractional order derivatives have shown be quite efficient to describe the diffusion in complex systems, with the advantage of producing exact expressions for the underlying diffusive properties. Recently, researchers have proposed different fractional-time operators (namely: the Caputo-Fabrizio and Atangana-Baleanu) which, differently from the well-known Riemann-Liouville operator, are defined by non-singular memory kernels. Here we proposed to use these new operators to generalize the usual diffusion equation. By analyzing the corresponding fractional diffusion equations within the continuous time random walk framework, we obtained waiting time distributions characterized by exponential, stretched exponential, and power-law functions, as well as a crossover between two behaviors. For the mean square displacement, we found crossovers between usual and confined diffusion, and between usual and sub-diffusion. We obtained the exact expressions for the probability distributions, where non-Gaussian and stationary distributions emerged. This former feature is remarkable because the fractional diffusion equation is solved without external forces and subjected to the free diffusion boundary conditions. We have further shown that these new fractional diffusion equations are related to diffusive processes with stochastic resetting, and to fractional diffusion equations with derivatives of distributed order. Thus, our results suggest that these new operators may be a simple and efficient way for incorporating different structural aspects into the system, opening new possibilities for modeling and investigating anomalous diffusive processes.",
    },
];

function getArticles()
{
    return ARTICLES;
}

function getArticleByDoi(doi)
{
    return ARTICLES.find(article => article.doi === doi);
}

export { getArticles, getArticleByDoi };

//------------------------------------------------------------------------------------------------------------------------------------------------------//

import fetch from 'node-fetch';
const request = require('request');

class Articles
{
    constructor(articles = [])
    {
        this.#ARTICLES = articles;
    }

    set newArticle({ doi, title, abstract })
    {
        // const DATA = await fetch(`https://www.doi.org/${doi}`);
        this.#ARTICLES.push({ doi, title, abstract });
    }

    get articles()
    {
        return this.#ARTICLES;
    }

    getArticleByDoi(doi)
    {
        return this.#ARTICLES.find(article => article.doi === doi);
    }
}

// const CIENTIFIC_ARTICLES = new Articles();
// CIENTIFIC_ARTICLES.newArticle(
//         {
//             "doi": "10.1038/nature14236",
//             "title": "Human-level control through deep reinforcement learning",
//             "abstract": "",
//         });

// export { Articles, CIENTIFIC_ARTICLES };

// async function articleByDoi(doi)
// {
//     // const DATA = await fetch(`https://www.doi.org/${doi}`);
//     const DATA = `https://www.doi.org/${doi}`;
//     return new Promise((resolve, reject) => {
//         request(DATA, (error, response, body) =>{
//             if (response.statusCode === 200)
//             {
//                 resolve(body);
//             } else {
//                 reject(response.statusCode);
//             }
//         });
//     });
// }