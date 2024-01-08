from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UserRole(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    ADMIN = 'ADMIN'
    FINANCE = 'FINANCE'
    TECHNICAL = 'TECHNICAL'
    ACCOUNT_HOLDER = 'ACCOUNT_HOLDER'
    READ_ONLY = 'READ_ONLY'
    SALES = 'SALES'
    MARKETING = 'MARKETING'
    APP_MANAGER = 'APP_MANAGER'
    DEVELOPER = 'DEVELOPER'
    ACCESS_TO_REPORTS = 'ACCESS_TO_REPORTS'
    CUSTOMER_SUPPORT = 'CUSTOMER_SUPPORT'
    CREATE_APPS = 'CREATE_APPS'
    CLOUD_MANAGED_DEVELOPER_ID = 'CLOUD_MANAGED_DEVELOPER_ID'
    CLOUD_MANAGED_APP_DISTRIBUTION = 'CLOUD_MANAGED_APP_DISTRIBUTION'
    def __init__(self):  # noqa: E501
        """UserRole - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'UserRole':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserRole of this UserRole.  # noqa: E501
        :rtype: UserRole
        """
        return util.deserialize_model(dikt, cls)
