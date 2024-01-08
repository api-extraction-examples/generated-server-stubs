import unittest

from flask import json

from openapi_server.models.app_preview_sets_response import AppPreviewSetsResponse  # noqa: E501
from openapi_server.models.app_screenshot_sets_response import AppScreenshotSetsResponse  # noqa: E501
from openapi_server.models.app_store_version_localization_create_request import AppStoreVersionLocalizationCreateRequest  # noqa: E501
from openapi_server.models.app_store_version_localization_response import AppStoreVersionLocalizationResponse  # noqa: E501
from openapi_server.models.app_store_version_localization_update_request import AppStoreVersionLocalizationUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppStoreVersionLocalizationsController(BaseTestCase):
    """AppStoreVersionLocalizationsController integration test stubs"""

    def test_app_store_version_localizations_app_preview_sets_get_to_many_related(self):
        """Test case for app_store_version_localizations_app_preview_sets_get_to_many_related

        
        """
        query_string = [('filter[previewType]', ['filter_preview_type_example']),
                        ('fields[appStoreVersionLocalizations]', ['fields_app_store_version_localizations_example']),
                        ('fields[appPreviews]', ['fields_app_previews_example']),
                        ('fields[appPreviewSets]', ['fields_app_preview_sets_example']),
                        ('limit', 56),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionLocalizations/{id}/appPreviewSets'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_version_localizations_app_screenshot_sets_get_to_many_related(self):
        """Test case for app_store_version_localizations_app_screenshot_sets_get_to_many_related

        
        """
        query_string = [('filter[screenshotDisplayType]', ['filter_screenshot_display_type_example']),
                        ('fields[appStoreVersionLocalizations]', ['fields_app_store_version_localizations_example']),
                        ('fields[appScreenshotSets]', ['fields_app_screenshot_sets_example']),
                        ('fields[appScreenshots]', ['fields_app_screenshots_example']),
                        ('limit', 56),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionLocalizations/{id}/appScreenshotSets'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_version_localizations_create_instance(self):
        """Test case for app_store_version_localizations_create_instance

        
        """
        app_store_version_localization_create_request = {"data":{"relationships":{"appStoreVersion":{"data":{"id":"id","type":"appStoreVersions"}}},"attributes":{"whatsNew":"whatsNew","keywords":"keywords","marketingUrl":"https://openapi-generator.tech","supportUrl":"https://openapi-generator.tech","description":"description","locale":"locale","promotionalText":"promotionalText"},"type":"appStoreVersionLocalizations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionLocalizations',
            method='POST',
            headers=headers,
            data=json.dumps(app_store_version_localization_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_version_localizations_delete_instance(self):
        """Test case for app_store_version_localizations_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionLocalizations/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_version_localizations_get_instance(self):
        """Test case for app_store_version_localizations_get_instance

        
        """
        query_string = [('fields[appStoreVersionLocalizations]', ['fields_app_store_version_localizations_example']),
                        ('include', ['include_example']),
                        ('fields[appScreenshotSets]', ['fields_app_screenshot_sets_example']),
                        ('fields[appPreviewSets]', ['fields_app_preview_sets_example']),
                        ('limit[appPreviewSets]', 56),
                        ('limit[appScreenshotSets]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionLocalizations/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_version_localizations_update_instance(self):
        """Test case for app_store_version_localizations_update_instance

        
        """
        app_store_version_localization_update_request = {"data":{"attributes":{"whatsNew":"whatsNew","keywords":"keywords","marketingUrl":"https://openapi-generator.tech","supportUrl":"https://openapi-generator.tech","description":"description","promotionalText":"promotionalText"},"id":"id","type":"appStoreVersionLocalizations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionLocalizations/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_store_version_localization_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
