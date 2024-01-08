import unittest

from flask import json

from openapi_server.models.delete_and_replace_version_bean import DeleteAndReplaceVersionBean  # noqa: E501
from openapi_server.models.page_bean_version import PageBeanVersion  # noqa: E501
from openapi_server.models.version import Version  # noqa: E501
from openapi_server.models.version_issue_counts import VersionIssueCounts  # noqa: E501
from openapi_server.models.version_move_bean import VersionMoveBean  # noqa: E501
from openapi_server.models.version_unresolved_issues_count import VersionUnresolvedIssuesCount  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectVersionsController(BaseTestCase):
    """ProjectVersionsController integration test stubs"""

    def test_create_version(self):
        """Test case for create_version

        Create version
        """
        version = {"releaseDate":"2000-01-23","description":"description","project":"project","archived":True,"expand":"expand","operations":[{"weight":0,"href":"href","id":"id","label":"label","styleClass":"styleClass","title":"title","iconClass":"iconClass"},{"weight":0,"href":"href","id":"id","label":"label","styleClass":"styleClass","title":"title","iconClass":"iconClass"}],"overdue":True,"name":"name","moveUnfixedIssuesTo":"https://openapi-generator.tech","self":"https://openapi-generator.tech","userReleaseDate":"userReleaseDate","id":"id","userStartDate":"userStartDate","projectId":6,"released":True,"startDate":"2000-01-23"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/version',
            method='POST',
            headers=headers,
            data=json.dumps(version),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_and_replace_version(self):
        """Test case for delete_and_replace_version

        Delete and replace version
        """
        delete_and_replace_version_bean = {"moveAffectedIssuesTo":1,"moveFixIssuesTo":5,"customFieldReplacementList":[{"customFieldId":0,"moveTo":6},{"customFieldId":0,"moveTo":6}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/version/{id}/removeAndSwap'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(delete_and_replace_version_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_version(self):
        """Test case for delete_version

        Delete version
        """
        query_string = [('moveFixIssuesTo', 'move_fix_issues_to_example'),
                        ('moveAffectedIssuesTo', 'move_affected_issues_to_example')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/version/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_versions(self):
        """Test case for get_project_versions

        Get project versions
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/versions'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_versions_paginated(self):
        """Test case for get_project_versions_paginated

        Get project versions paginated
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('orderBy', 'order_by_example'),
                        ('query', 'query_example'),
                        ('status', 'status_example'),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/version'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_version(self):
        """Test case for get_version

        Get version
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/version/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_version_related_issues(self):
        """Test case for get_version_related_issues

        Get version's related issues count
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/version/{id}/relatedIssueCounts'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_version_unresolved_issues(self):
        """Test case for get_version_unresolved_issues

        Get version's unresolved issues count
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/version/{id}/unresolvedIssueCount'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_merge_versions(self):
        """Test case for merge_versions

        Merge versions
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/version/{id}/mergeto/{move_issues_to}'.format(id='id_example', move_issues_to='move_issues_to_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_version(self):
        """Test case for move_version

        Move version
        """
        version_move_bean = {"after":"https://openapi-generator.tech","position":"Earlier"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/version/{id}/move'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(version_move_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_version(self):
        """Test case for update_version

        Update version
        """
        version = {"releaseDate":"2000-01-23","description":"description","project":"project","archived":True,"expand":"expand","operations":[{"weight":0,"href":"href","id":"id","label":"label","styleClass":"styleClass","title":"title","iconClass":"iconClass"},{"weight":0,"href":"href","id":"id","label":"label","styleClass":"styleClass","title":"title","iconClass":"iconClass"}],"overdue":True,"name":"name","moveUnfixedIssuesTo":"https://openapi-generator.tech","self":"https://openapi-generator.tech","userReleaseDate":"userReleaseDate","id":"id","userStartDate":"userStartDate","projectId":6,"released":True,"startDate":"2000-01-23"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/version/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(version),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
