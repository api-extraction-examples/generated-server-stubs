import unittest

from flask import json

from openapi_server.models.end_user_license_agreement_create_request import EndUserLicenseAgreementCreateRequest  # noqa: E501
from openapi_server.models.end_user_license_agreement_response import EndUserLicenseAgreementResponse  # noqa: E501
from openapi_server.models.end_user_license_agreement_update_request import EndUserLicenseAgreementUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.territories_response import TerritoriesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEndUserLicenseAgreementsController(BaseTestCase):
    """EndUserLicenseAgreementsController integration test stubs"""

    def test_end_user_license_agreements_create_instance(self):
        """Test case for end_user_license_agreements_create_instance

        
        """
        end_user_license_agreement_create_request = {"data":{"relationships":{"app":{"data":{"id":"id","type":"apps"}},"territories":{"data":[{"id":"id","type":"territories"},{"id":"id","type":"territories"}]}},"attributes":{"agreementText":"agreementText"},"type":"endUserLicenseAgreements"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/endUserLicenseAgreements',
            method='POST',
            headers=headers,
            data=json.dumps(end_user_license_agreement_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_end_user_license_agreements_delete_instance(self):
        """Test case for end_user_license_agreements_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/endUserLicenseAgreements/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_end_user_license_agreements_get_instance(self):
        """Test case for end_user_license_agreements_get_instance

        
        """
        query_string = [('fields[endUserLicenseAgreements]', ['fields_end_user_license_agreements_example']),
                        ('include', ['include_example']),
                        ('fields[territories]', ['fields_territories_example']),
                        ('limit[territories]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/endUserLicenseAgreements/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_end_user_license_agreements_territories_get_to_many_related(self):
        """Test case for end_user_license_agreements_territories_get_to_many_related

        
        """
        query_string = [('fields[territories]', ['fields_territories_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/endUserLicenseAgreements/{id}/territories'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_end_user_license_agreements_update_instance(self):
        """Test case for end_user_license_agreements_update_instance

        
        """
        end_user_license_agreement_update_request = {"data":{"relationships":{"territories":{"data":[{"id":"id","type":"territories"},{"id":"id","type":"territories"}]}},"attributes":{"agreementText":"agreementText"},"id":"id","type":"endUserLicenseAgreements"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/endUserLicenseAgreements/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(end_user_license_agreement_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
