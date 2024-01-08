import unittest

from flask import json

from openapi_server.models.issue_type_ids import IssueTypeIds  # noqa: E501
from openapi_server.models.issue_type_scheme_details import IssueTypeSchemeDetails  # noqa: E501
from openapi_server.models.issue_type_scheme_id import IssueTypeSchemeID  # noqa: E501
from openapi_server.models.issue_type_scheme_project_association import IssueTypeSchemeProjectAssociation  # noqa: E501
from openapi_server.models.issue_type_scheme_update_details import IssueTypeSchemeUpdateDetails  # noqa: E501
from openapi_server.models.order_of_issue_types import OrderOfIssueTypes  # noqa: E501
from openapi_server.models.page_bean_issue_type_scheme import PageBeanIssueTypeScheme  # noqa: E501
from openapi_server.models.page_bean_issue_type_scheme_mapping import PageBeanIssueTypeSchemeMapping  # noqa: E501
from openapi_server.models.page_bean_issue_type_scheme_projects import PageBeanIssueTypeSchemeProjects  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueTypeSchemesController(BaseTestCase):
    """IssueTypeSchemesController integration test stubs"""

    def test_add_issue_types_to_issue_type_scheme(self):
        """Test case for add_issue_types_to_issue_type_scheme

        Add issue types to issue type scheme
        """
        issue_type_ids = {"issueTypeIds":["issueTypeIds","issueTypeIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme/{issue_type_scheme_id}/issuetype'.format(issue_type_scheme_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_ids),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_assign_issue_type_scheme_to_project(self):
        """Test case for assign_issue_type_scheme_to_project

        Assign issue type scheme to project
        """
        issue_type_scheme_project_association = {"issueTypeSchemeId":"issueTypeSchemeId","projectId":"projectId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme/project',
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_scheme_project_association),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_issue_type_scheme(self):
        """Test case for create_issue_type_scheme

        Create issue type scheme
        """
        issue_type_scheme_details = {"defaultIssueTypeId":"defaultIssueTypeId","issueTypeIds":["issueTypeIds","issueTypeIds"],"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme',
            method='POST',
            headers=headers,
            data=json.dumps(issue_type_scheme_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_issue_type_scheme(self):
        """Test case for delete_issue_type_scheme

        Delete issue type scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme/{issue_type_scheme_id}'.format(issue_type_scheme_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_issue_type_schemes(self):
        """Test case for get_all_issue_type_schemes

        Get all issue type schemes
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('id', [56]),
                        ('orderBy', 'id'),
                        ('expand', ''),
                        ('queryString', '')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_type_scheme_for_projects(self):
        """Test case for get_issue_type_scheme_for_projects

        Get issue type schemes for projects
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('projectId', [56])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme/project',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_type_schemes_mapping(self):
        """Test case for get_issue_type_schemes_mapping

        Get issue type scheme items
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('issueTypeSchemeId', [56])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme/mapping',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_issue_type_from_issue_type_scheme(self):
        """Test case for remove_issue_type_from_issue_type_scheme

        Remove issue type from issue type scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme/{issue_type_scheme_id}/issuetype/{issue_type_id}'.format(issue_type_scheme_id=56, issue_type_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reorder_issue_types_in_issue_type_scheme(self):
        """Test case for reorder_issue_types_in_issue_type_scheme

        Change order of issue types
        """
        order_of_issue_types = {"issueTypeIds":["issueTypeIds","issueTypeIds"],"after":"after","position":"First"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme/{issue_type_scheme_id}/issuetype/move'.format(issue_type_scheme_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(order_of_issue_types),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_issue_type_scheme(self):
        """Test case for update_issue_type_scheme

        Update issue type scheme
        """
        issue_type_scheme_update_details = {"defaultIssueTypeId":"defaultIssueTypeId","name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescheme/{issue_type_scheme_id}'.format(issue_type_scheme_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_scheme_update_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
