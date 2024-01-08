import unittest

from flask import json

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.builds_response import BuildsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.pre_release_versions_response import PreReleaseVersionsResponse  # noqa: E501
from openapi_server.models.prerelease_version_response import PrereleaseVersionResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPreReleaseVersionsController(BaseTestCase):
    """PreReleaseVersionsController integration test stubs"""

    def test_pre_release_versions_app_get_to_one_related(self):
        """Test case for pre_release_versions_app_get_to_one_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/preReleaseVersions/{id}/app'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pre_release_versions_builds_get_to_many_related(self):
        """Test case for pre_release_versions_builds_get_to_many_related

        
        """
        query_string = [('fields[builds]', ['fields_builds_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/preReleaseVersions/{id}/builds'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pre_release_versions_get_collection(self):
        """Test case for pre_release_versions_get_collection

        
        """
        query_string = [('filter[builds.expired]', ['filter_builds_expired_example']),
                        ('filter[builds.processingState]', ['filter_builds_processing_state_example']),
                        ('filter[platform]', ['filter_platform_example']),
                        ('filter[version]', ['filter_version_example']),
                        ('filter[app]', ['filter_app_example']),
                        ('filter[builds]', ['filter_builds_example']),
                        ('sort', ['sort_example']),
                        ('fields[preReleaseVersions]', ['fields_pre_release_versions_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[builds]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/preReleaseVersions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pre_release_versions_get_instance(self):
        """Test case for pre_release_versions_get_instance

        
        """
        query_string = [('fields[preReleaseVersions]', ['fields_pre_release_versions_example']),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[builds]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/preReleaseVersions/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
