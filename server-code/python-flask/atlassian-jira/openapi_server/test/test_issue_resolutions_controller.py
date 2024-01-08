import unittest

from flask import json

from openapi_server.models.create_resolution_details import CreateResolutionDetails  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_resolution_json_bean import PageBeanResolutionJsonBean  # noqa: E501
from openapi_server.models.reorder_issue_resolutions_request import ReorderIssueResolutionsRequest  # noqa: E501
from openapi_server.models.resolution import Resolution  # noqa: E501
from openapi_server.models.resolution_id import ResolutionId  # noqa: E501
from openapi_server.models.set_default_resolution_request import SetDefaultResolutionRequest  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.update_resolution_details import UpdateResolutionDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueResolutionsController(BaseTestCase):
    """IssueResolutionsController integration test stubs"""

    def test_create_resolution(self):
        """Test case for create_resolution

        Create resolution
        """
        create_resolution_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/resolution',
            method='POST',
            headers=headers,
            data=json.dumps(create_resolution_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_resolution(self):
        """Test case for delete_resolution

        Delete resolution
        """
        query_string = [('replaceWith', 'replace_with_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/resolution/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_resolution(self):
        """Test case for get_resolution

        Get resolution
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/resolution/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_resolutions(self):
        """Test case for get_resolutions

        Get resolutions
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/resolution',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_resolutions(self):
        """Test case for move_resolutions

        Move resolutions
        """
        reorder_issue_resolutions_request = {"ids":["ids","ids"],"after":"after","position":"position"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/resolution/move',
            method='PUT',
            headers=headers,
            data=json.dumps(reorder_issue_resolutions_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_resolutions(self):
        """Test case for search_resolutions

        Search resolutions
        """
        query_string = [('startAt', '0'),
                        ('maxResults', '50'),
                        ('id', ['id_example']),
                        ('onlyDefault', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/resolution/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_default_resolution(self):
        """Test case for set_default_resolution

        Set default resolution
        """
        set_default_resolution_request = {"id":"id"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/resolution/default',
            method='PUT',
            headers=headers,
            data=json.dumps(set_default_resolution_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_resolution(self):
        """Test case for update_resolution

        Update resolution
        """
        update_resolution_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/resolution/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_resolution_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
