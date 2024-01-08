import unittest

from flask import json

from openapi_server.models.page_bean_issue_security_level_member import PageBeanIssueSecurityLevelMember  # noqa: E501
from openapi_server.models.security_level import SecurityLevel  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueSecurityLevelController(BaseTestCase):
    """IssueSecurityLevelController integration test stubs"""

    def test_get_issue_security_level(self):
        """Test case for get_issue_security_level

        Get issue security level
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/securitylevel/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_security_level_members(self):
        """Test case for get_issue_security_level_members

        Get issue security level members
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('issueSecurityLevelId', [56]),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/{issue_security_scheme_id}/members'.format(issue_security_scheme_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
