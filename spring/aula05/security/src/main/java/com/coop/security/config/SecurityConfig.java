package com.coop.security.config;

    public class SecurityConfig extends WebSecurityConfigureAdapter {
        protected void configure(AuthenticationManagerBuilder  auth)
            throws Exception {
           auth.inMemoryAuthentication().withUser("user1").password("{noop}secret1")
                   .roles("USER").and().withUser("admin1").password("{noop}secret1")
                   .roles("USER", "ADMIN");
        }

        protected void configure(HttpSecurity http) throws Exception {
            http.httpBasic().and().authorizeRequests().antMatchers("/students/**")
                    .hasRole("USER").anrMatchers("/**").hasRole("ADMIN").and()
                    .csrf().disable().headers().frameOptions().disable();
        }


    }
}
