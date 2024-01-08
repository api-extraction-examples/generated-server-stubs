import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.selling_privileges import SellingPrivileges  # noqa: E501
from openapi_server import util


def get_privileges():  # noqa: E501
    """get_privileges

    This method retrieves the seller&#39;s current set of privileges, including whether or not the seller&#39;s eBay registration has been completed, as well as the details of their site-wide &lt;b&gt;sellingLimt&lt;/b&gt; (the amount and quantity they can sell on a given day). # noqa: E501


    :rtype: Union[SellingPrivileges, Tuple[SellingPrivileges, int], Tuple[SellingPrivileges, int, Dict[str, str]]
    """
    return 'do some magic!'
