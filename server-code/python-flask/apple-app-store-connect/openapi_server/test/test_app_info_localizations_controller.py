import unittest

from flask import json

from openapi_server.models.app_info_localization_create_request import AppInfoLocalizationCreateRequest  # noqa: E501
from openapi_server.models.app_info_localization_response import AppInfoLocalizationResponse  # noqa: E501
from openapi_server.models.app_info_localization_update_request import AppInfoLocalizationUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppInfoLocalizationsController(BaseTestCase):
    """AppInfoLocalizationsController integration test stubs"""

    def test_app_info_localizations_create_instance(self):
        """Test case for app_info_localizations_create_instance

        
        """
        app_info_localization_create_request = {"data":{"relationships":{"appInfo":{"data":{"id":"id","type":"appInfos"}}},"attributes":{"subtitle":"subtitle","name":"name","privacyPolicyText":"privacyPolicyText","locale":"locale","privacyPolicyUrl":"privacyPolicyUrl"},"type":"appInfoLocalizations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfoLocalizations',
            method='POST',
            headers=headers,
            data=json.dumps(app_info_localization_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_info_localizations_delete_instance(self):
        """Test case for app_info_localizations_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfoLocalizations/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_info_localizations_get_instance(self):
        """Test case for app_info_localizations_get_instance

        
        """
        query_string = [('fields[appInfoLocalizations]', ['fields_app_info_localizations_example']),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfoLocalizations/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_info_localizations_update_instance(self):
        """Test case for app_info_localizations_update_instance

        
        """
        app_info_localization_update_request = {"data":{"attributes":{"subtitle":"subtitle","name":"name","privacyPolicyText":"privacyPolicyText","privacyPolicyUrl":"privacyPolicyUrl"},"id":"id","type":"appInfoLocalizations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appInfoLocalizations/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_info_localization_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
