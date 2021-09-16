package apap.tutorial.pergipergi.service;

import apap.tutorial.pergipergi.model.TravelAgensiModel;
import apap.tutorial.pergipergi.repository.TravelAgensiDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TravelAgensiServiceImpl implements TravelAgensiService{

    @Autowired
    TravelAgensiDb travelAgensiDb;

    @Override
    public void addAgensi(TravelAgensiModel travelAgensi) {
        travelAgensiDb.save(travelAgensi);
    }

    @Override
    public List<TravelAgensiModel> getListAgensi() {
        return travelAgensiDb.findAll();
    }

    @Override
    public TravelAgensiModel getAgensiByidAgensi(String noAgensi) {
        return travelAgensiDb.findByNoAgensi(noAgensi).get();
    }

    @Override
    public TravelAgensiModel updateAgensi(TravelAgensiModel travelAgensi) {
        travelAgensiDb.save(travelAgensi);
        return travelAgensi;
    }
}
