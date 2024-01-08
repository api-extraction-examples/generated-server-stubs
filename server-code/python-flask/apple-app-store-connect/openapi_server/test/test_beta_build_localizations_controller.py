import unittest

from flask import json

from openapi_server.models.beta_build_localization_create_request import BetaBuildLocalizationCreateRequest  # noqa: E501
from openapi_server.models.beta_build_localization_response import BetaBuildLocalizationResponse  # noqa: E501
from openapi_server.models.beta_build_localization_update_request import BetaBuildLocalizationUpdateRequest  # noqa: E501
from openapi_server.models.beta_build_localizations_response import BetaBuildLocalizationsResponse  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBetaBuildLocalizationsController(BaseTestCase):
    """BetaBuildLocalizationsController integration test stubs"""

    def test_beta_build_localizations_build_get_to_one_related(self):
        """Test case for beta_build_localizations_build_get_to_one_related

        
        """
        query_string = [('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaBuildLocalizations/{id}/build'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_build_localizations_create_instance(self):
        """Test case for beta_build_localizations_create_instance

        
        """
        beta_build_localization_create_request = {"data":{"relationships":{"build":{"data":{"id":"id","type":"builds"}}},"attributes":{"whatsNew":"whatsNew","locale":"locale"},"type":"betaBuildLocalizations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaBuildLocalizations',
            method='POST',
            headers=headers,
            data=json.dumps(beta_build_localization_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_build_localizations_delete_instance(self):
        """Test case for beta_build_localizations_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaBuildLocalizations/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_build_localizations_get_collection(self):
        """Test case for beta_build_localizations_get_collection

        
        """
        query_string = [('filter[locale]', ['filter_locale_example']),
                        ('filter[build]', ['filter_build_example']),
                        ('fields[betaBuildLocalizations]', ['fields_beta_build_localizations_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaBuildLocalizations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_build_localizations_get_instance(self):
        """Test case for beta_build_localizations_get_instance

        
        """
        query_string = [('fields[betaBuildLocalizations]', ['fields_beta_build_localizations_example']),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaBuildLocalizations/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_build_localizations_update_instance(self):
        """Test case for beta_build_localizations_update_instance

        
        """
        beta_build_localization_update_request = {"data":{"attributes":{"whatsNew":"whatsNew"},"id":"id","type":"betaBuildLocalizations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaBuildLocalizations/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(beta_build_localization_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
