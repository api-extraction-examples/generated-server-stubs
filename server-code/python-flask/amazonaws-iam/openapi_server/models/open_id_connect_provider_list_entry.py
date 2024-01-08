from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class OpenIDConnectProviderListEntry(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, arn=None):  # noqa: E501
        """OpenIDConnectProviderListEntry - a model defined in OpenAPI

        :param arn: The arn of this OpenIDConnectProviderListEntry.  # noqa: E501
        :type arn: str
        """
        self.openapi_types = {
            'arn': str
        }

        self.attribute_map = {
            'arn': 'Arn'
        }

        self._arn = arn

    @classmethod
    def from_dict(cls, dikt) -> 'OpenIDConnectProviderListEntry':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OpenIDConnectProviderListEntry of this OpenIDConnectProviderListEntry.  # noqa: E501
        :rtype: OpenIDConnectProviderListEntry
        """
        return util.deserialize_model(dikt, cls)

    @property
    def arn(self) -> str:
        """Gets the arn of this OpenIDConnectProviderListEntry.

        <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>  # noqa: E501

        :return: The arn of this OpenIDConnectProviderListEntry.
        :rtype: str
        """
        return self._arn

    @arn.setter
    def arn(self, arn: str):
        """Sets the arn of this OpenIDConnectProviderListEntry.

        <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>  # noqa: E501

        :param arn: The arn of this OpenIDConnectProviderListEntry.
        :type arn: str
        """
        if arn is not None and len(arn) > 2048:
            raise ValueError("Invalid value for `arn`, length must be less than or equal to `2048`")  # noqa: E501
        if arn is not None and len(arn) < 20:
            raise ValueError("Invalid value for `arn`, length must be greater than or equal to `20`")  # noqa: E501

        self._arn = arn
