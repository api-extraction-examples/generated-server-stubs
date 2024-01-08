import unittest

from flask import json

from openapi_server.models.issue_link import IssueLink  # noqa: E501
from openapi_server.models.link_issue_request_json_bean import LinkIssueRequestJsonBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueLinksController(BaseTestCase):
    """IssueLinksController integration test stubs"""

    def test_delete_issue_link(self):
        """Test case for delete_issue_link

        Delete issue link
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issueLink/{link_id}'.format(link_id='link_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_link(self):
        """Test case for get_issue_link

        Get issue link
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issueLink/{link_id}'.format(link_id='link_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_link_issues(self):
        """Test case for link_issues

        Create issue link
        """
        link_issue_request_json_bean = {"outwardIssue":{"self":"https://openapi-generator.tech","id":"id","key":"key"},"comment":{"renderedBody":"renderedBody","visibility":"","created":"2000-01-23T04:56:07.000+00:00","self":"self","jsdPublic":True,"id":"id","body":"","jsdAuthorCanSeeRequest":True,"updated":"2000-01-23T04:56:07.000+00:00","properties":[{"value":"","key":"key"},{"value":"","key":"key"}]},"inwardIssue":{"self":"https://openapi-generator.tech","id":"id","key":"key"},"type":{"inward":"inward","name":"name","self":"https://openapi-generator.tech","id":"id","outward":"outward"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issueLink',
            method='POST',
            headers=headers,
            data=json.dumps(link_issue_request_json_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
