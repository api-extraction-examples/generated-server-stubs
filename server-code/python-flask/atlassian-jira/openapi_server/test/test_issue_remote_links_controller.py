import unittest

from flask import json

from openapi_server.models.remote_issue_link import RemoteIssueLink  # noqa: E501
from openapi_server.models.remote_issue_link_identifies import RemoteIssueLinkIdentifies  # noqa: E501
from openapi_server.models.remote_issue_link_request import RemoteIssueLinkRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueRemoteLinksController(BaseTestCase):
    """IssueRemoteLinksController integration test stubs"""

    def test_create_or_update_remote_issue_link(self):
        """Test case for create_or_update_remote_issue_link

        Create or update remote issue link
        """
        remote_issue_link_request = {"application":"","globalId":"globalId","relationship":"relationship","object":""}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/remotelink'.format(issue_id_or_key='issue_id_or_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(remote_issue_link_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_remote_issue_link_by_global_id(self):
        """Test case for delete_remote_issue_link_by_global_id

        Delete remote issue link by global ID
        """
        query_string = [('globalId', 'system=http://www.mycompany.com/support&id=1')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/remotelink'.format(issue_id_or_key='10000'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_remote_issue_link_by_id(self):
        """Test case for delete_remote_issue_link_by_id

        Delete remote issue link by ID
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/remotelink/{link_id}'.format(issue_id_or_key='10000', link_id='10000'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remote_issue_link_by_id(self):
        """Test case for get_remote_issue_link_by_id

        Get remote issue link by ID
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/remotelink/{link_id}'.format(issue_id_or_key='issue_id_or_key_example', link_id='link_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remote_issue_links(self):
        """Test case for get_remote_issue_links

        Get remote issue links
        """
        query_string = [('globalId', 'global_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/remotelink'.format(issue_id_or_key='10000'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_remote_issue_link(self):
        """Test case for update_remote_issue_link

        Update remote issue link by ID
        """
        remote_issue_link_request = {"application":"","globalId":"globalId","relationship":"relationship","object":""}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/remotelink/{link_id}'.format(issue_id_or_key='10000', link_id='10000'),
            method='PUT',
            headers=headers,
            data=json.dumps(remote_issue_link_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
