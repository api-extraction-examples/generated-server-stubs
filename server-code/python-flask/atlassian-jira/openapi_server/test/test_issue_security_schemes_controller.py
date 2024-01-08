import unittest

from flask import json

from openapi_server.models.add_security_scheme_levels_request_bean import AddSecuritySchemeLevelsRequestBean  # noqa: E501
from openapi_server.models.create_issue_security_scheme_details import CreateIssueSecuritySchemeDetails  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_issue_security_scheme_to_project_mapping import PageBeanIssueSecuritySchemeToProjectMapping  # noqa: E501
from openapi_server.models.page_bean_security_level import PageBeanSecurityLevel  # noqa: E501
from openapi_server.models.page_bean_security_level_member import PageBeanSecurityLevelMember  # noqa: E501
from openapi_server.models.page_bean_security_scheme_with_projects import PageBeanSecuritySchemeWithProjects  # noqa: E501
from openapi_server.models.security_scheme import SecurityScheme  # noqa: E501
from openapi_server.models.security_scheme_id import SecuritySchemeId  # noqa: E501
from openapi_server.models.security_scheme_members_request import SecuritySchemeMembersRequest  # noqa: E501
from openapi_server.models.security_schemes import SecuritySchemes  # noqa: E501
from openapi_server.models.set_default_levels_request import SetDefaultLevelsRequest  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.update_issue_security_level_details import UpdateIssueSecurityLevelDetails  # noqa: E501
from openapi_server.models.update_issue_security_scheme_request_bean import UpdateIssueSecuritySchemeRequestBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueSecuritySchemesController(BaseTestCase):
    """IssueSecuritySchemesController integration test stubs"""

    def test_add_security_level(self):
        """Test case for add_security_level

        Add issue security levels
        """
        add_security_scheme_levels_request_bean = {"levels":[{"isDefault":True,"members":[{"parameter":"parameter","type":"type"},{"parameter":"parameter","type":"type"}],"name":"name","description":"description"},{"isDefault":True,"members":[{"parameter":"parameter","type":"type"},{"parameter":"parameter","type":"type"}],"name":"name","description":"description"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/{scheme_id}/level'.format(scheme_id='scheme_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(add_security_scheme_levels_request_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_security_level_members(self):
        """Test case for add_security_level_members

        Add issue security level members
        """
        security_scheme_members_request = {"members":[{"parameter":"parameter","type":"type"},{"parameter":"parameter","type":"type"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/{scheme_id}/level/{level_id}/member'.format(scheme_id='scheme_id_example', level_id='level_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(security_scheme_members_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_issue_security_scheme(self):
        """Test case for create_issue_security_scheme

        Create issue security scheme
        """
        create_issue_security_scheme_details = {"name":"name","description":"description","levels":[{"isDefault":True,"members":[{"parameter":"parameter","type":"type"},{"parameter":"parameter","type":"type"}],"name":"name","description":"description"},{"isDefault":True,"members":[{"parameter":"parameter","type":"type"},{"parameter":"parameter","type":"type"}],"name":"name","description":"description"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes',
            method='POST',
            headers=headers,
            data=json.dumps(create_issue_security_scheme_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_security_scheme(self):
        """Test case for delete_security_scheme

        Delete issue security scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/{scheme_id}'.format(scheme_id='scheme_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_security_scheme(self):
        """Test case for get_issue_security_scheme

        Get issue security scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/{id}'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_security_schemes(self):
        """Test case for get_issue_security_schemes

        Get issue security schemes
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_security_level_members(self):
        """Test case for get_security_level_members

        Get issue security level members
        """
        query_string = [('startAt', '0'),
                        ('maxResults', '50'),
                        ('id', ['id_example']),
                        ('schemeId', ['scheme_id_example']),
                        ('levelId', ['level_id_example']),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/level/member',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_security_levels(self):
        """Test case for get_security_levels

        Get issue security levels
        """
        query_string = [('startAt', '0'),
                        ('maxResults', '50'),
                        ('id', ['id_example']),
                        ('schemeId', ['scheme_id_example']),
                        ('onlyDefault', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/level',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_level(self):
        """Test case for remove_level

        Remove issue security level
        """
        query_string = [('replaceWith', 'replace_with_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/{scheme_id}/level/{level_id}'.format(scheme_id='scheme_id_example', level_id='level_id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_member_from_security_level(self):
        """Test case for remove_member_from_security_level

        Remove member from issue security level
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/{scheme_id}/level/{level_id}/member/{member_id}'.format(scheme_id='scheme_id_example', level_id='level_id_example', member_id='member_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_projects_using_security_schemes(self):
        """Test case for search_projects_using_security_schemes

        Get projects using issue security schemes
        """
        query_string = [('startAt', '0'),
                        ('maxResults', '50'),
                        ('issueSecuritySchemeId', ['issue_security_scheme_id_example']),
                        ('projectId', ['project_id_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/project',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_security_schemes(self):
        """Test case for search_security_schemes

        Search issue security schemes
        """
        query_string = [('startAt', '0'),
                        ('maxResults', '50'),
                        ('id', ['id_example']),
                        ('projectId', ['project_id_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_default_levels(self):
        """Test case for set_default_levels

        Set default issue security levels
        """
        set_default_levels_request = {"defaultValues":[{"issueSecuritySchemeId":"issueSecuritySchemeId","defaultLevelId":"defaultLevelId"},{"issueSecuritySchemeId":"issueSecuritySchemeId","defaultLevelId":"defaultLevelId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/level/default',
            method='PUT',
            headers=headers,
            data=json.dumps(set_default_levels_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_issue_security_scheme(self):
        """Test case for update_issue_security_scheme

        Update issue security scheme
        """
        update_issue_security_scheme_request_bean = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_issue_security_scheme_request_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_security_level(self):
        """Test case for update_security_level

        Update issue security level
        """
        update_issue_security_level_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issuesecurityschemes/{scheme_id}/level/{level_id}'.format(scheme_id='scheme_id_example', level_id='level_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_issue_security_level_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
