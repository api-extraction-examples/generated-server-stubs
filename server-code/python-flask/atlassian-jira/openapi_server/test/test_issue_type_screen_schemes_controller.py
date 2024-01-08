import unittest

from flask import json

from openapi_server.models.issue_type_ids import IssueTypeIds  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_details import IssueTypeScreenSchemeDetails  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_id import IssueTypeScreenSchemeId  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_mapping_details import IssueTypeScreenSchemeMappingDetails  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_project_association import IssueTypeScreenSchemeProjectAssociation  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_update_details import IssueTypeScreenSchemeUpdateDetails  # noqa: E501
from openapi_server.models.page_bean_issue_type_screen_scheme import PageBeanIssueTypeScreenScheme  # noqa: E501
from openapi_server.models.page_bean_issue_type_screen_scheme_item import PageBeanIssueTypeScreenSchemeItem  # noqa: E501
from openapi_server.models.page_bean_issue_type_screen_schemes_projects import PageBeanIssueTypeScreenSchemesProjects  # noqa: E501
from openapi_server.models.page_bean_project_details import PageBeanProjectDetails  # noqa: E501
from openapi_server.models.update_default_screen_scheme import UpdateDefaultScreenScheme  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueTypeScreenSchemesController(BaseTestCase):
    """IssueTypeScreenSchemesController integration test stubs"""

    def test_append_mappings_for_issue_type_screen_scheme(self):
        """Test case for append_mappings_for_issue_type_screen_scheme

        Append mappings to issue type screen scheme
        """
        issue_type_screen_scheme_mapping_details = {"issueTypeMappings":[{"issueTypeId":"issueTypeId","screenSchemeId":"screenSchemeId"},{"issueTypeId":"issueTypeId","screenSchemeId":"screenSchemeId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme/{issue_type_screen_scheme_id}/mapping'.format(issue_type_screen_scheme_id='issue_type_screen_scheme_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_screen_scheme_mapping_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_assign_issue_type_screen_scheme_to_project(self):
        """Test case for assign_issue_type_screen_scheme_to_project

        Assign issue type screen scheme to project
        """
        issue_type_screen_scheme_project_association = {"issueTypeScreenSchemeId":"issueTypeScreenSchemeId","projectId":"projectId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme/project',
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_screen_scheme_project_association),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_issue_type_screen_scheme(self):
        """Test case for create_issue_type_screen_scheme

        Create issue type screen scheme
        """
        issue_type_screen_scheme_details = {"name":"name","description":"description","issueTypeMappings":[{"issueTypeId":"issueTypeId","screenSchemeId":"screenSchemeId"},{"issueTypeId":"issueTypeId","screenSchemeId":"screenSchemeId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme',
            method='POST',
            headers=headers,
            data=json.dumps(issue_type_screen_scheme_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_issue_type_screen_scheme(self):
        """Test case for delete_issue_type_screen_scheme

        Delete issue type screen scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme/{issue_type_screen_scheme_id}'.format(issue_type_screen_scheme_id='issue_type_screen_scheme_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_type_screen_scheme_mappings(self):
        """Test case for get_issue_type_screen_scheme_mappings

        Get issue type screen scheme items
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('issueTypeScreenSchemeId', [56])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme/mapping',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_type_screen_scheme_project_associations(self):
        """Test case for get_issue_type_screen_scheme_project_associations

        Get issue type screen schemes for projects
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
            '/rest/api/3/issuetypescreenscheme/project',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_type_screen_schemes(self):
        """Test case for get_issue_type_screen_schemes

        Get issue type screen schemes
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('id', [56]),
                        ('queryString', ''),
                        ('orderBy', 'id'),
                        ('expand', '')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_projects_for_issue_type_screen_scheme(self):
        """Test case for get_projects_for_issue_type_screen_scheme

        Get issue type screen scheme projects
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('query', '')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme/{issue_type_screen_scheme_id}/project'.format(issue_type_screen_scheme_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_mappings_from_issue_type_screen_scheme(self):
        """Test case for remove_mappings_from_issue_type_screen_scheme

        Remove mappings from issue type screen scheme
        """
        issue_type_ids = {"issueTypeIds":["issueTypeIds","issueTypeIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme/{issue_type_screen_scheme_id}/mapping/remove'.format(issue_type_screen_scheme_id='issue_type_screen_scheme_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(issue_type_ids),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_default_screen_scheme(self):
        """Test case for update_default_screen_scheme

        Update issue type screen scheme default screen scheme
        """
        update_default_screen_scheme = {"screenSchemeId":"screenSchemeId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme/{issue_type_screen_scheme_id}/mapping/default'.format(issue_type_screen_scheme_id='issue_type_screen_scheme_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_default_screen_scheme),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_issue_type_screen_scheme(self):
        """Test case for update_issue_type_screen_scheme

        Update issue type screen scheme
        """
        issue_type_screen_scheme_update_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuetypescreenscheme/{issue_type_screen_scheme_id}'.format(issue_type_screen_scheme_id='issue_type_screen_scheme_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_screen_scheme_update_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
