package kg.megacom.filmotekaservice.mappers.impl;

import kg.megacom.filmotekaservice.mappers.ClientMapper;
import kg.megacom.filmotekaservice.models.dto.ClientDto;
import kg.megacom.filmotekaservice.models.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientMapperImpl implements ClientMapper {
    @Override
    public ClientDto toDto(Client client) {
        ClientDto clientDto = new ClientDto();
        clientDto.setId(client.getId());
        clientDto.setFirstName(client.getFirstName());
        clientDto.setLastName(client.getLastName());
        clientDto.setPatronymic(client.getPatronymic());
        clientDto.setDateOfBirth(client.getDateOfBirth());
        clientDto.setAddress(client.getAddress());
        return clientDto;
    }

    @Override
    public Client toEntity(ClientDto clientDto) {
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setFirstName(clientDto.getFirstName());
        client.setLastName(clientDto.getLastName());
        client.setPatronymic(clientDto.getPatronymic());
        client.setAddress(clientDto.getAddress());
        client.setDateOfBirth(clientDto.getDateOfBirth());
        return client;
    }

    @Override
    public List<ClientDto> toDtos(List<Client> t) {
        return t.stream()
                .map(x -> toDto(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<Client> toEntities(List<ClientDto> clientDtos) {
        return clientDtos.stream()
                .map(x -> toEntity(x))
                .collect(Collectors.toList());
    }
}
