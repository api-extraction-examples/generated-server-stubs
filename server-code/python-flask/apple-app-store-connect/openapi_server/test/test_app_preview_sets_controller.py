import unittest

from flask import json

from openapi_server.models.app_preview_set_app_previews_linkages_request import AppPreviewSetAppPreviewsLinkagesRequest  # noqa: E501
from openapi_server.models.app_preview_set_app_previews_linkages_response import AppPreviewSetAppPreviewsLinkagesResponse  # noqa: E501
from openapi_server.models.app_preview_set_create_request import AppPreviewSetCreateRequest  # noqa: E501
from openapi_server.models.app_preview_set_response import AppPreviewSetResponse  # noqa: E501
from openapi_server.models.app_previews_response import AppPreviewsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppPreviewSetsController(BaseTestCase):
    """AppPreviewSetsController integration test stubs"""

    def test_app_preview_sets_app_previews_get_to_many_related(self):
        """Test case for app_preview_sets_app_previews_get_to_many_related

        
        """
        query_string = [('fields[appPreviews]', ['fields_app_previews_example']),
                        ('fields[appPreviewSets]', ['fields_app_preview_sets_example']),
                        ('limit', 56),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviewSets/{id}/appPreviews'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_preview_sets_app_previews_get_to_many_relationship(self):
        """Test case for app_preview_sets_app_previews_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviewSets/{id}/relationships/appPreviews'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_preview_sets_app_previews_replace_to_many_relationship(self):
        """Test case for app_preview_sets_app_previews_replace_to_many_relationship

        
        """
        app_preview_set_app_previews_linkages_request = {"data":[{"id":"id","type":"appPreviews"},{"id":"id","type":"appPreviews"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviewSets/{id}/relationships/appPreviews'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_preview_set_app_previews_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_preview_sets_create_instance(self):
        """Test case for app_preview_sets_create_instance

        
        """
        app_preview_set_create_request = {"data":{"relationships":{"appStoreVersionLocalization":{"data":{"id":"id","type":"appStoreVersionLocalizations"}}},"attributes":{},"type":"appPreviewSets"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviewSets',
            method='POST',
            headers=headers,
            data=json.dumps(app_preview_set_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_preview_sets_delete_instance(self):
        """Test case for app_preview_sets_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviewSets/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_preview_sets_get_instance(self):
        """Test case for app_preview_sets_get_instance

        
        """
        query_string = [('fields[appPreviewSets]', ['fields_app_preview_sets_example']),
                        ('include', ['include_example']),
                        ('fields[appPreviews]', ['fields_app_previews_example']),
                        ('limit[appPreviews]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviewSets/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
