import unittest

from flask import json

from openapi_server.models.add_group_bean import AddGroupBean  # noqa: E501
from openapi_server.models.found_groups import FoundGroups  # noqa: E501
from openapi_server.models.group import Group  # noqa: E501
from openapi_server.models.page_bean_group_details import PageBeanGroupDetails  # noqa: E501
from openapi_server.models.page_bean_user_details import PageBeanUserDetails  # noqa: E501
from openapi_server.models.update_user_to_group_bean import UpdateUserToGroupBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestGroupsController(BaseTestCase):
    """GroupsController integration test stubs"""

    def test_add_user_to_group(self):
        """Test case for add_user_to_group

        Add user to group
        """
        update_user_to_group_bean = {"accountId":"accountId","name":"name"}
        query_string = [('groupname', 'groupname_example'),
                        ('groupId', 'group_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/group/user',
            method='POST',
            headers=headers,
            data=json.dumps(update_user_to_group_bean),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bulk_get_groups(self):
        """Test case for bulk_get_groups

        Bulk get groups
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('groupId', ['3571b9a7-348f-414a-9087-8e1ea03a7df8']),
                        ('groupName', ['group_name_example']),
                        ('accessType', 'access_type_example'),
                        ('applicationKey', 'application_key_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/group/bulk',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_group(self):
        """Test case for create_group

        Create group
        """
        add_group_bean = {"name":"name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/group',
            method='POST',
            headers=headers,
            data=json.dumps(add_group_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_find_groups(self):
        """Test case for find_groups

        Find groups
        """
        query_string = [('accountId', 'account_id_example'),
                        ('query', 'query'),
                        ('exclude', ['exclude_example']),
                        ('excludeId', ['exclude_id_example']),
                        ('maxResults', 56),
                        ('caseInsensitive', False),
                        ('userName', 'user_name_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/groups/picker',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_group(self):
        """Test case for get_group

        Get group
        """
        query_string = [('groupname', 'groupname_example'),
                        ('groupId', 'group_id_example'),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/group',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_users_from_group(self):
        """Test case for get_users_from_group

        Get users from group
        """
        query_string = [('groupname', 'groupname_example'),
                        ('groupId', 'group_id_example'),
                        ('includeInactiveUsers', False),
                        ('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/group/member',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_group(self):
        """Test case for remove_group

        Remove group
        """
        query_string = [('groupname', 'groupname_example'),
                        ('groupId', 'group_id_example'),
                        ('swapGroup', 'swap_group_example'),
                        ('swapGroupId', 'swap_group_id_example')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/group',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_user_from_group(self):
        """Test case for remove_user_from_group

        Remove user from group
        """
        query_string = [('groupname', 'groupname_example'),
                        ('groupId', 'group_id_example'),
                        ('username', 'username_example'),
                        ('accountId', '5b10ac8d82e05b22cc7d4ef5')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/group/user',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
