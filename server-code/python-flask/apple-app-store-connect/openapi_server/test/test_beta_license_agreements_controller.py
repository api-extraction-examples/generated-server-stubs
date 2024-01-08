import unittest

from flask import json

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.beta_license_agreement_response import BetaLicenseAgreementResponse  # noqa: E501
from openapi_server.models.beta_license_agreement_update_request import BetaLicenseAgreementUpdateRequest  # noqa: E501
from openapi_server.models.beta_license_agreements_response import BetaLicenseAgreementsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBetaLicenseAgreementsController(BaseTestCase):
    """BetaLicenseAgreementsController integration test stubs"""

    def test_beta_license_agreements_app_get_to_one_related(self):
        """Test case for beta_license_agreements_app_get_to_one_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaLicenseAgreements/{id}/app'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_license_agreements_get_collection(self):
        """Test case for beta_license_agreements_get_collection

        
        """
        query_string = [('filter[app]', ['filter_app_example']),
                        ('fields[betaLicenseAgreements]', ['fields_beta_license_agreements_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaLicenseAgreements',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_license_agreements_get_instance(self):
        """Test case for beta_license_agreements_get_instance

        
        """
        query_string = [('fields[betaLicenseAgreements]', ['fields_beta_license_agreements_example']),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaLicenseAgreements/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_license_agreements_update_instance(self):
        """Test case for beta_license_agreements_update_instance

        
        """
        beta_license_agreement_update_request = {"data":{"attributes":{"agreementText":"agreementText"},"id":"id","type":"betaLicenseAgreements"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaLicenseAgreements/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(beta_license_agreement_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
