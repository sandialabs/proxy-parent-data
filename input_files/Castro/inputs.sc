
max_step = 100
stop_time = 1.0e-2

geometry.is_periodic =  0      0      0
geometry.coord_sys   =  0
geometry.prob_lo     =  0      0      0
geometry.prob_hi     =  1.0e9  1.0e9  1.0e9
amr.n_cell           =   752    752    752

castro.lo_bc =  2   2   2
castro.hi_bc =  2   2   2

castro.do_hydro = 1

castro.cfl            = 0.5
castro.change_max     = 1.5

castro.sum_interval   = 1
castro.v              = 1
amr.v                 = 1

amr.max_level       = 0
amr.blocking_factor = 16
amr.max_grid_size   = 64

# Disable plotfiles for benchmarking
amr.checkpoint_files_output = 0
amr.plot_files_output = 0

amr.probin_file = probin.sc
