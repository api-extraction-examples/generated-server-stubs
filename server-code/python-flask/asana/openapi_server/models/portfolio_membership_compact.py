from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.portfolio_compact import PortfolioCompact
from openapi_server.models.user_compact import UserCompact
from openapi_server import util

from openapi_server.models.portfolio_compact import PortfolioCompact  # noqa: E501
from openapi_server.models.user_compact import UserCompact  # noqa: E501

class PortfolioMembershipCompact(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, portfolio=None, user=None):  # noqa: E501
        """PortfolioMembershipCompact - a model defined in OpenAPI

        :param gid: The gid of this PortfolioMembershipCompact.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this PortfolioMembershipCompact.  # noqa: E501
        :type resource_type: str
        :param portfolio: The portfolio of this PortfolioMembershipCompact.  # noqa: E501
        :type portfolio: PortfolioCompact
        :param user: The user of this PortfolioMembershipCompact.  # noqa: E501
        :type user: UserCompact
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'portfolio': PortfolioCompact,
            'user': UserCompact
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'portfolio': 'portfolio',
            'user': 'user'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._portfolio = portfolio
        self._user = user

    @classmethod
    def from_dict(cls, dikt) -> 'PortfolioMembershipCompact':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PortfolioMembershipCompact of this PortfolioMembershipCompact.  # noqa: E501
        :rtype: PortfolioMembershipCompact
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this PortfolioMembershipCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this PortfolioMembershipCompact.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this PortfolioMembershipCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this PortfolioMembershipCompact.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this PortfolioMembershipCompact.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this PortfolioMembershipCompact.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this PortfolioMembershipCompact.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this PortfolioMembershipCompact.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def portfolio(self) -> PortfolioCompact:
        """Gets the portfolio of this PortfolioMembershipCompact.


        :return: The portfolio of this PortfolioMembershipCompact.
        :rtype: PortfolioCompact
        """
        return self._portfolio

    @portfolio.setter
    def portfolio(self, portfolio: PortfolioCompact):
        """Sets the portfolio of this PortfolioMembershipCompact.


        :param portfolio: The portfolio of this PortfolioMembershipCompact.
        :type portfolio: PortfolioCompact
        """

        self._portfolio = portfolio

    @property
    def user(self) -> UserCompact:
        """Gets the user of this PortfolioMembershipCompact.


        :return: The user of this PortfolioMembershipCompact.
        :rtype: UserCompact
        """
        return self._user

    @user.setter
    def user(self, user: UserCompact):
        """Sets the user of this PortfolioMembershipCompact.


        :param user: The user of this PortfolioMembershipCompact.
        :type user: UserCompact
        """

        self._user = user