import unittest

from flask import json

from openapi_server.models.create_priority_details import CreatePriorityDetails  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_priority import PageBeanPriority  # noqa: E501
from openapi_server.models.priority import Priority  # noqa: E501
from openapi_server.models.priority_id import PriorityId  # noqa: E501
from openapi_server.models.reorder_issue_priorities import ReorderIssuePriorities  # noqa: E501
from openapi_server.models.set_default_priority_request import SetDefaultPriorityRequest  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.update_priority_details import UpdatePriorityDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssuePrioritiesController(BaseTestCase):
    """IssuePrioritiesController integration test stubs"""

    def test_create_priority(self):
        """Test case for create_priority

        Create priority
        """
        create_priority_details = {"statusColor":"statusColor","name":"name","description":"description","iconUrl":"/images/icons/priorities/blocker.png"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/priority',
            method='POST',
            headers=headers,
            data=json.dumps(create_priority_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_priority(self):
        """Test case for delete_priority

        Delete priority
        """
        query_string = [('replaceWith', 'replace_with_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/priority/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_priorities(self):
        """Test case for get_priorities

        Get priorities
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/priority',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_priority(self):
        """Test case for get_priority

        Get priority
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/priority/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_priorities(self):
        """Test case for move_priorities

        Move priorities
        """
        reorder_issue_priorities = {"ids":["ids","ids"],"after":"after","position":"position"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/priority/move',
            method='PUT',
            headers=headers,
            data=json.dumps(reorder_issue_priorities),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_priorities(self):
        """Test case for search_priorities

        Search priorities
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
            '/rest/api/3/priority/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_default_priority(self):
        """Test case for set_default_priority

        Set default priority
        """
        set_default_priority_request = {"id":"id"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/priority/default',
            method='PUT',
            headers=headers,
            data=json.dumps(set_default_priority_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_priority(self):
        """Test case for update_priority

        Update priority
        """
        update_priority_details = {"statusColor":"statusColor","name":"name","description":"description","iconUrl":"/images/icons/priorities/blocker.png"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/priority/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_priority_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
