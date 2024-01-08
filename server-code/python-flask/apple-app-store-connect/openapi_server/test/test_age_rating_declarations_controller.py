import unittest

from flask import json

from openapi_server.models.age_rating_declaration_response import AgeRatingDeclarationResponse  # noqa: E501
from openapi_server.models.age_rating_declaration_update_request import AgeRatingDeclarationUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAgeRatingDeclarationsController(BaseTestCase):
    """AgeRatingDeclarationsController integration test stubs"""

    def test_age_rating_declarations_update_instance(self):
        """Test case for age_rating_declarations_update_instance

        
        """
        age_rating_declaration_update_request = {"data":{"attributes":{"alcoholTobaccoOrDrugUseOrReferences":"NONE","gamblingAndContests":True,"gamblingSimulated":"NONE","sexualContentGraphicAndNudity":"NONE","violenceRealistic":"NONE","gambling":True,"horrorOrFearThemes":"NONE","profanityOrCrudeHumor":"NONE","seventeenPlus":True,"violenceRealisticProlongedGraphicOrSadistic":"NONE","contests":"NONE","matureOrSuggestiveThemes":"NONE","unrestrictedWebAccess":True,"violenceCartoonOrFantasy":"NONE","medicalOrTreatmentInformation":"NONE","sexualContentOrNudity":"NONE"},"id":"id","type":"ageRatingDeclarations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/ageRatingDeclarations/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(age_rating_declaration_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
