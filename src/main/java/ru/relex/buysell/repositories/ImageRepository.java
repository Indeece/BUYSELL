package ru.relex.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.relex.buysell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
