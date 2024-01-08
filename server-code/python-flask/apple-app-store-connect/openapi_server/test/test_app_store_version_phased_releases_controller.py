import unittest

from flask import json

from openapi_server.models.app_store_version_phased_release_create_request import AppStoreVersionPhasedReleaseCreateRequest  # noqa: E501
from openapi_server.models.app_store_version_phased_release_response import AppStoreVersionPhasedReleaseResponse  # noqa: E501
from openapi_server.models.app_store_version_phased_release_update_request import AppStoreVersionPhasedReleaseUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppStoreVersionPhasedReleasesController(BaseTestCase):
    """AppStoreVersionPhasedReleasesController integration test stubs"""

    def test_app_store_version_phased_releases_create_instance(self):
        """Test case for app_store_version_phased_releases_create_instance

        
        """
        app_store_version_phased_release_create_request = {"data":{"relationships":{"appStoreVersion":{"data":{"id":"id","type":"appStoreVersions"}}},"attributes":{},"type":"appStoreVersionPhasedReleases"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionPhasedReleases',
            method='POST',
            headers=headers,
            data=json.dumps(app_store_version_phased_release_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_version_phased_releases_delete_instance(self):
        """Test case for app_store_version_phased_releases_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionPhasedReleases/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_version_phased_releases_update_instance(self):
        """Test case for app_store_version_phased_releases_update_instance

        
        """
        app_store_version_phased_release_update_request = {"data":{"attributes":{},"id":"id","type":"appStoreVersionPhasedReleases"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionPhasedReleases/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_store_version_phased_release_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
