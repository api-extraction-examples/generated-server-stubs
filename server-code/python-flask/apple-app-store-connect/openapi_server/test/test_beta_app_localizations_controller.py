import unittest

from flask import json

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.beta_app_localization_create_request import BetaAppLocalizationCreateRequest  # noqa: E501
from openapi_server.models.beta_app_localization_response import BetaAppLocalizationResponse  # noqa: E501
from openapi_server.models.beta_app_localization_update_request import BetaAppLocalizationUpdateRequest  # noqa: E501
from openapi_server.models.beta_app_localizations_response import BetaAppLocalizationsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBetaAppLocalizationsController(BaseTestCase):
    """BetaAppLocalizationsController integration test stubs"""

    def test_beta_app_localizations_app_get_to_one_related(self):
        """Test case for beta_app_localizations_app_get_to_one_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppLocalizations/{id}/app'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_localizations_create_instance(self):
        """Test case for beta_app_localizations_create_instance

        
        """
        beta_app_localization_create_request = {"data":{"relationships":{"app":{"data":{"id":"id","type":"apps"}}},"attributes":{"marketingUrl":"marketingUrl","description":"description","locale":"locale","tvOsPrivacyPolicy":"tvOsPrivacyPolicy","privacyPolicyUrl":"privacyPolicyUrl","feedbackEmail":"feedbackEmail"},"type":"betaAppLocalizations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppLocalizations',
            method='POST',
            headers=headers,
            data=json.dumps(beta_app_localization_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_localizations_delete_instance(self):
        """Test case for beta_app_localizations_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppLocalizations/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_localizations_get_collection(self):
        """Test case for beta_app_localizations_get_collection

        
        """
        query_string = [('filter[locale]', ['filter_locale_example']),
                        ('filter[app]', ['filter_app_example']),
                        ('fields[betaAppLocalizations]', ['fields_beta_app_localizations_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppLocalizations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_localizations_get_instance(self):
        """Test case for beta_app_localizations_get_instance

        
        """
        query_string = [('fields[betaAppLocalizations]', ['fields_beta_app_localizations_example']),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppLocalizations/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_app_localizations_update_instance(self):
        """Test case for beta_app_localizations_update_instance

        
        """
        beta_app_localization_update_request = {"data":{"attributes":{"marketingUrl":"marketingUrl","description":"description","tvOsPrivacyPolicy":"tvOsPrivacyPolicy","privacyPolicyUrl":"privacyPolicyUrl","feedbackEmail":"feedbackEmail"},"id":"id","type":"betaAppLocalizations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaAppLocalizations/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(beta_app_localization_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
